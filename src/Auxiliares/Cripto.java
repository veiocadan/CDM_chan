package Auxiliares;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Cripto {

	public enum CriptoOpcoes {

		SOFT_ENCODE(1), HARD_ENCODE(2), SOFT_DECODE(3), HARD_DECODE(4);

		private final int valor;

		CriptoOpcoes(int valorOpcao) {
			valor = valorOpcao;
		}

		public int getValor() {
			return valor;
		}

	}

	public static void decriptar(String caminhoEnt, String caminhoSai, CriptoOpcoes opcao)
			throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

		if (opcao.getValor() < 2) {

			throw new RuntimeException();
			
		} else {

			Path p = Paths.get(caminhoEnt);
			byte[] array = Files.readAllBytes(p);

			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			byte[] chave = "chancelaria".getBytes("UTF-8");

			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] chave16bytes = md.digest(chave);

			cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(chave16bytes, "AES"));
			byte[] encrypted = cipher.doFinal(array);

			Path path = Paths.get(caminhoSai);
			Files.write(path, encrypted);
			
			if(opcao.getValor() == 4) {
				
				new File(caminhoEnt).delete();
				
			}
		}

	}

	public static void encriptar(String caminhoEnt, String caminhoSai, CriptoOpcoes opcao)
			throws FileNotFoundException, IOException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, IllegalBlockSizeException, BadPaddingException {

		if (opcao.getValor() > 2) {

			throw new RuntimeException();
			
		} else {

			Path p = Paths.get(caminhoEnt);
			byte[] array = Files.readAllBytes(p);

			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			byte[] chave = "chancelaria".getBytes("UTF-8");

			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] chave16bytes = md.digest(chave);

			cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(chave16bytes, "AES"));
			byte[] encrypted = cipher.doFinal(array);

			Path path = Paths.get(caminhoSai);
			Files.write(path, encrypted);
			
			if(opcao.getValor() == 2) {
				
				new File(caminhoEnt).delete();
				
			}
		}

	}

}
