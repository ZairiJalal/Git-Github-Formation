class Animal {
    public static String getDefault(){
        return "Hello";
    }
     public static String getBirdValue(){
        return "Tweet";
    }
       
    public static void main(String[] args){
        String txt = getDefault();
        if(args[0].equals("Bird")){
            txt = getBirdValue();
        }
        System.out.println(txt);
    }
}