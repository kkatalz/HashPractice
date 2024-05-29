import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestUsage {
    public static void main(String[] args) {

        String input = "I am Carlo!";
        System.out.println(" Task 1 with MessageDigest");

        System.out.println("MD5: " + generateHash(input, "MD5"));
        System.out.println("SHA-1: " + generateHash(input, "SHA-1"));
        System.out.println("SHA-256: " + generateHash(input, "SHA-256"));
    }

    private static String generateHash(String input, String algorithm) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            byte[] hash = messageDigest.digest(input.getBytes());
            return resultBytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String resultBytesToHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xFF & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}
