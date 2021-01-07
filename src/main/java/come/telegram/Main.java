package come.telegram;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

public class Main {

    public static void main(String[] args) {
        ApiContextInitializer.init();

        TelegramBotsApi telegramBotApi = new TelegramBotsApi();

        try {
            Bot bot = new Bot();
            telegramBotApi.registerBot(bot);
        } catch (TelegramApiRequestException e){
            e.printStackTrace();
        }
    }
}
