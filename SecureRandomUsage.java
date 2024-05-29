import java.security.Provider;
import java.security.SecureRandom;
import java.security.NoSuchAlgorithmException;


public class SecureRandomUsage {
    public static void main(String[] args) {

//  Check available providers
//        for (Provider provider : Security.getProviders()) {
//            System.out.println(provider);
//            for (Map.Entry<Object, Object> entry : provider.entrySet()) {
//                System.out.println("\t" + entry.getKey());
//            }
//        }

        String input = "I am Bob!";
        System.out.println("Task 2 with SecureRandom");
        System.out.println("SHA1PRNG: " + generateHash(input, "SHA1PRNG"));
        System.out.println("DRBG: " + generateHash(input, "DRBG"));
        System.out.println("Windows-PRNG: " + generateHash(input, "Windows-PRNG"));

    }

    private static String generateHash(String input, String algorithm) {
        try {
            SecureRandom random = SecureRandom.getInstance(algorithm);
            byte[] inputBytes = input.getBytes();
            random.setSeed(inputBytes);
            return bytesToHex(inputBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String bytesToHex(byte[] bytes) {
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
