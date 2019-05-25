public class Main {

    public static void main(String[] args) {

        String name = "Pawel Knapik";
        System.out.println(nameModulo(name));
    }

    public static int nameModulo (String name){

        int result = 0;
        name.replaceAll("ą", "a").
                replaceAll("Ą", "a").
                replaceAll("ć", "c").
                replaceAll("Ć", "c").
                replaceAll("ę", "e").
                replaceAll("Ę", "e").
                replaceAll("ł", "l").
                replaceAll("Ł", "l").
                replaceAll("ń", "n").
                replaceAll("Ń", "n").
                replaceAll("ó", "o").
                replaceAll("Ó", "o").
                replaceAll("ś", "s").
                replaceAll("Ś", "s").
                replaceAll("ż", "z").
                replaceAll("Ż", "z").
                replaceAll("ź", "z").
                replaceAll("Ź", "z");
        char[] array = name.toLowerCase().toCharArray();

        for (int i = 0; i <array.length ; i++) {
                if(array[i]!=32){
                    result = result+array[i]-96;
            }
        }
        return result % 2;
    }
}
