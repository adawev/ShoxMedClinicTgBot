package diyor.adashev;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotService {
    public SendMessage start(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Добро пожаловать в Shox Med Bot!");
        return sendMessage;
    }
    public SendMessage setlanguage(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите ваш язык:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDF7\uD83C\uDDFA Русский");
        button.setCallbackData("RusLanguageId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFF O'zbekcha");
        button.setCallbackData("UzbekLanguageId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFF Узбекча");
        button.setCallbackData("UzbekKrillLanguageId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDEC\uD83C\uDDE7 English");
        button.setCallbackData("EnglishLanguageId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage menuMain(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Ushbu bot Shox International Hospital xizmatlari haqida ma'lumot olishingizga yordam beradi.");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCB3 'Shox Med' kartasi");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCDD Fikr-mulohaza \uD83D\uDC4D\uD83D\uDC4E");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDDFE Qabul");
        row2.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("✅ Natijalar");
        row2.add(button3);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDE48 Shifokor yozuvini o'qib berish");
        row3.add(button4);

        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83D\uDD0E Xizmatlarni qidirish (narx)");
        row3.add(button5);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDCF2 Qo'ng'iroq buyurtma qilish");
        row4.add(button6);

        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDE91 Tez yordamni chaqirish");
        row4.add(button7);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("☎\uFE0F Biz bilan bog'lanish");
        row5.add(button8);

        KeyboardButton button9 = new KeyboardButton();
        button9.setText("\uD83D\uDCCD Bizning manzillarimiz");
        row5.add(button9);
        rowList.add(row5);

        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("\uD83D\uDE9A\uD83D\uDD2C Ko'chib yuruvchi laboratoriya");
        row6.add(button10);
        rowList.add(row6);

        KeyboardRow row7 = new KeyboardRow();
        KeyboardButton button11 = new KeyboardButton();
        button11.setText("\uD83C\uDDFA\uD83C\uDDFF Tilni o'zgartirish");
        row7.add(button11);
        rowList.add(row7);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage shoxMedkartasiMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Marhamat!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCCA Tafsilotlar");
        button.setCallbackData("TafsilotlarId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("\uD83E\uDEAA Elektron karta");
        button.setCallbackData("ElektronKartaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Qaytish");
        button.setCallbackData("QaytishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }
    public InlineKeyboardMarkup shoxMedkartasiMenuEdit(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Marhamat!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCCA Tafsilotlar");
        button.setCallbackData("TafsilotlarId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("\uD83E\uDEAA Elektron karta");
        button.setCallbackData("ElektronKartaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Qaytish");
        button.setCallbackData("QaytishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;

    }
    public InlineKeyboardMarkup tafsilotlarMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Marhamat!");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCFB Eski kartani tiklash");
        button.setCallbackData("KartaTiklashId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCD6 Qoidalar");
        button.setCallbackData("QoidalarId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("❗\uFE0F Cheklovlar");
        button.setCallbackData("CheklovlarId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("⬅\uFE0F Qaytish");
        button.setCallbackData("TafsilotQaytishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public SendMessage yaqindaIshgaTushadi(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Yaqinda ishga tushadi...");
        return sendMessage;
    }
    public SendMessage fikrMulohaza(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Mening raqamimni yuborish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Bekor qilish");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage kochibyuruvchilab(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Mening raqamimni yuborish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Bekor qilish");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage qongiroq(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Mening raqamimni yuborish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Bekor qilish");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage tezYordam(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Mening raqamimni yuborish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Bekor qilish");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage shifokorYozuvi(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos telefon raqamingizni yuboring (Namuna: +998999999999) \uD83D\uDCF2");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDCF2 Mening raqamimni yuborish");
        button.setRequestContact(true);
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("❌ Bekor qilish");
        row1.add(button1);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage qabul(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qabulga yozilish uchun kerakli bo'limni tanlang.");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("MSKT");
        button.setCallbackData("MSKTId");
        row.add(button);


        button = new InlineKeyboardButton();
        button.setText("MRT");
        button.setCallbackData("MRTId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("UZI");
        button.setCallbackData("UZIId");
        row.add(button);


        button = new InlineKeyboardButton();
        button.setText("RENTGEN");
        button.setCallbackData("RENTGENId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList();
        button = new InlineKeyboardButton();
        button.setText("MUTAXASSISLAR");
        button.setCallbackData("MutaxassislarId");
        row.add(button);



        button = new InlineKeyboardButton();
        button.setText("❌ Bekor qilish");
        button.setCallbackData("BekorQilishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage natijalar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Namunada ko'rsatilgandek ID va Parol ni kiriting.  ID bo'sh joy Parol. \n" +
                "\n" +
                "Namuna: 123456 ABCD12");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("❌ Bekor qilish");
        row.add(button);
        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage xizmatQidirish(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Qidirish uchun quyidagi tugmachani bosing \uD83D\uDC47");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Qidirish");
        button.setCallbackData("QidirishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage boglanish(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅ SHOX MED CENTER\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Mirobod tumani, Oybek ko'chasi, 34\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 202-02-12\n" +
                "\n" +
                "⏱\uFE0F Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ SHOX INTERNATIONAL HOSPITAL\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Yakkasaroy tumani, Kichik Xalqa Yo'li ko'chasi, 70a\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-00-17\n" +
                "\n" +
                "⏱\uFE0F Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ MED ZDOROVAYA SEMYA CENTER\n" +
                "\uD83D\uDCCD Manzil: Toshkent shahar, Chilonzor tumani 11-kvarta, Maqsud Shayx-Zoda ko'chasi, 31A\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (71) 207-10-51\n" +
                "\n" +
                "⏱\uFE0F Ish vaqtlari: 24/7.\n" +
                "\n" +
                "✅ SHOX MED PEDIATRIYA\n" +
                "\uD83D\uDCCD Manzil: Toshkent 4-oʻtish Xushnava, 26/2\n" +
                "\n" +
                "☎\uFE0F Telefon raqam:\n" +
                " Call center: 1183\n" +
                " +998 (55) 519-11-83\n" +
                "\n" +
                "⏱\uFE0F Ish vaqtlari: 24/7.");
        return sendMessage;
    }
    public SendMessage manzilimiz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Iltimos filialni tanlang:");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("SHOX MED CENTER");
        row.add(button);

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("SHOX INTERNATIONAL HOSPITAL");
        row.add(button1);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("MED ZDAROVAYA SEMYA CENTER");
        row1.add(button2);

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("SHOX MED PEDIATRIYA");
        row1.add(button3);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⬅\uFE0F Qaytish");
        row2.add(button4);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;

    }
    public SendMessage tilOzgartirish(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Tilingizni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDF7\uD83C\uDDFA Русский");
        button.setCallbackData("RusLanguageId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFF O'zbekcha");
        button.setCallbackData("UzbekLanguageId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFF Узбекча");
        button.setCallbackData("UzbekKrillLanguageId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDEC\uD83C\uDDE7 English");
        button.setCallbackData("EnglishLanguageId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
}
