public class Concatenate {
    public static void main(String[] args) {
        String string1 = "My name is ";
        String string2 = "Chris";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        String string4 = "Welcome," + " ninja" + "!";
        System.out.println(string4);
        String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja);
    }
}