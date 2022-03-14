class Animal {
    public static String getDefault(){
        return "Hello";
    }
<<<<<<< HEAD
  
    public static void main(String[] args){
         
=======
     public static String getBirdValue(){
        return "Tweet";
    }
    public static String getCatValue(){
        return "Cat";
    }
       
    public static void main(String[] args){
        String txt = getDefault();
        if(args[0].equals("Bird")){
            txt = getBirdValue();
        }
        if(args[0].equals("Cat")){
            txt = getCatValue();
        }
>>>>>>> bird
        System.out.println(txt);
    }
}