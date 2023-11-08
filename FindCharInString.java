// Question 11
public class FindCharInString {
    public static void main(String[] args){
        String source = args[0]; 
        char chr = args[1].length() > 0 ? args[1].charAt(0) : ' '; 
        String temp = "Find the char: " + chr + "in the string:"; 
        temp += source;
        System.out.println(temp);
        int result = -1; // if index not found return -1 as error control
        boolean flag = false;
        for (int index = 0; index < source.length() && !flag; index++){         
            if (chr == source.charAt(index)){
                result = index;
                flag = true;
            }
        }
		System.out.println(result);
	}
}

