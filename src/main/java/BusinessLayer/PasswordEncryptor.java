package BusinessLayer;

public interface PasswordEncryptor {
    String encrypt(String password, String salt); // само шифрование
    String generateSalt();

}
