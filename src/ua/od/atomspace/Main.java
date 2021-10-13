package ua.od.atomspace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Hello, guys! I send you my email joe@gmail.com so we can" +
                "keep in touch. Thanks, Joe! That's cool! I am sending you" +
                "my address: tim@yandex.ru. Let's stay in touch...";
        Pattern email = Pattern.compile("(\\w)+@(gmail|yandex)\\.(com|ru)");// конструктор паттерна приватный, поэтому получаем объект
        // этого класса с помощью статического метода, в который передаем регулярное выражение

        Matcher matcher = email.matcher(text);// получаем объект класса мэтчер с помощью метода класса паттерн, в который передаем строку для поиска

        while (matcher.find()){// пока находим по регулярному выражению
            System.out.println(matcher.group());// если метод .group() без аргументов, то получаем всю строку, подходящую по регулярному выражению
        }

        while (matcher.find()){
            System.out.println(matcher.group(1));// если указываем первую группу, то получаем только то с регулярного выражения, что соответсует группе (\w)
        }

        while (matcher.find()){
            System.out.println(matcher.group(2));// если указываем вторую группу, то получаем только то с регулярного выражения, что соответсует группе (gmail|yandex)
        }

        while (matcher.find()){
            System.out.println(matcher.group(3));// если указываем третью группу, то получаем только то с регулярного выражения, что соответсует группе (com|ru)
        }
    }
}
