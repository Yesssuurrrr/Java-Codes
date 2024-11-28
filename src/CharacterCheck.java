public class CharacterCheck {
    public static void main(String[] args) {
       
        char ch = '#'; 
        
        
        if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}
