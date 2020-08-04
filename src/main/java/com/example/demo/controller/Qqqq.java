package com.example.demo.controller;

public class Qqqq {
    public static void main(String[] args) {
//        int[] a  = {1,2,3,4,5,6};
//        a.length
        /*String a = "123";
        String b = "123";
        String c = new String("123");
        System.out.println(a.length());
        System.out.println(a == b);
        System.out.println(a == c);*/

        /*String str = "( [ [ ] { }";
        System.out.println(str.indexOf("("));
        System.out.println(str.charAt(0));
        System.out.println(str.length());
        System.out.println(str.charAt(2) == ')');
        System.out.println("---------");

        int flag = -1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == '('){
                    if (str.charAt(j) != ' '){
                        System.out.println("j:"+j);
                        if (str.charAt(j) != ')'){

                            break;
                        }else {
                            System.out.println("true "+"j:"+j);
                        }
                    }
                }
                if (str.charAt(i) == '['){
                    if (str.charAt(j) != ' '){
                        if (str.charAt(j) != ']'){
                            break;
                        }else {
                            System.out.println("true "+"j:"+j);
                        }
                    }
                }
                if (str.charAt(i) == '{'){
                    if (str.charAt(j) != ' '){
                        if (str.charAt(j) != '}'){
                            break;
                        }else {
                            System.out.println("true "+"j:"+j);
                        }
                    }
                }

            }
        }


        System.out.println("-----------");
        char[] arrStr = str.toCharArray();
        System.out.println(arrStr);
        System.out.println(arrStr[0]);


        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 1; j < arrStr.length; j++) {
                if (arrStr[i] == '('){

                }
            }
        }*/
        System.out.println(Qqqq.str());
    }

    public static boolean str(){
        String str = "( ) [ ] { }";
        int flag = -1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == '('){
                    if (str.charAt(j) != ' '){
                        if (str.charAt(j) != ')'){
                            System.out.println("j:"+j);
                            return false;
                        }else {
                            System.out.println("true "+"j:"+j);
                        }
                    }
                }
                if (str.charAt(i) == '['){
                    if (str.charAt(j) != ' '){
                        if (str.charAt(j) != ']'){
                            return false;
                        }else {
                            System.out.println("true "+"j:"+j);
                        }
                    }
                }
                if (str.charAt(i) == '{'){
                    if (str.charAt(j) != ' '){
                        if (str.charAt(j) != '}'){
                            return false;
                        }else {
                            System.out.println("true "+"j:"+j);
                        }
                    }
                }

            }
        }
        return true;
    }



}
