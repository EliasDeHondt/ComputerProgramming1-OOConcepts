package Chatbot4;

import java.util.Scanner;

/**
 * @author Elias De Hondt
 * 18/11/2022
 */
public class DemoChatBot {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        ChatBot chatbot = new ChatBot("Veronica");
        System.out.println(chatbot);
        System.out.println("Tik \"stop\" om te eindigen");
        String vraag;
        do {
            vraag = key.nextLine();
            System.out.println(chatbot.antwoordOpVraag(vraag));
        } while (!vraag.toLowerCase().equals("stop"));
    }
}
