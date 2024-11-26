package diyor.adashev;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {
    private MyBotService myBotService = new MyBotService();
    @Override
    public void onUpdateReceived(Update update) {




        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            if (text.equals("/start")){
                try {
                    execute(myBotService.start(chatId));
                    execute(myBotService.setlanguage(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCB3 'Shox Med' kartasi")){
                try {
                    execute(myBotService.shoxMedkartasiMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCDD Fikr-mulohaza \uD83D\uDC4D\uD83D\uDC4E")){
                try {
                    execute(myBotService.fikrMulohaza(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("❌ Bekor qilish") || text.equals("⬅\uFE0F Qaytish")){
                try {
                    execute(myBotService.menuMain(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83E\uDDFE Qabul")){
                try {
                    execute(myBotService.qabul(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("✅ Natijalar")){
                try {
                    execute(myBotService.natijalar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDE48 Shifokor yozuvini o'qib berish")){
                try {
                    execute(myBotService.shifokorYozuvi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDD0E Xizmatlarni qidirish (narx)")){
                try {
                    execute(myBotService.xizmatQidirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCF2 Qo'ng'iroq buyurtma qilish")){
                try {
                    execute(myBotService.qongiroq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDE91 Tez yordamni chaqirish")){
                try {
                    execute(myBotService.tezYordam(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("☎\uFE0F Biz bilan bog'lanish")){
                try {
                    execute(myBotService.boglanish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDCCD Bizning manzillarimiz")){
                try {
                    execute(myBotService.manzilimiz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83D\uDE9A\uD83D\uDD2C Ko'chib yuruvchi laboratoriya")){
                try {
                    execute(myBotService.kochibyuruvchilab(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDDFA\uD83C\uDDFF Tilni o'zgartirish")){
                try {
                    execute(myBotService.tilOzgartirish(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

        }else if (update.hasCallbackQuery()){
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();
            Integer messageId = callbackQuery.getMessage().getMessageId();


            if (data.equals("UzbekLanguageId")){
                try {
                    execute(myBotService.menuMain(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("ElektronKartaId")){
                try {
                    execute(myBotService.elektronKarta(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("OrqagaToShoxMedKarta")){
                try {
                    execute(myBotService.shoxMedkartasiMenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("TafsilotlarId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.tafsilotlarMenu(chatId));

                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("KartaTiklashId")){
                try {
                    execute(myBotService.yaqindaIshgaTushadi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("QoidalarId")){
                try {
                    execute(myBotService.yaqindaIshgaTushadi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("CheklovlarId")){
                try {
                    execute(myBotService.yaqindaIshgaTushadi(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("TafsilotQaytishId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(myBotService.shoxMedkartasiMenuEdit(chatId));

                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("BekorQilishId")){
                try {
                    execute(myBotService.menuMain(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("MSKTId")){
                try {
                    execute(myBotService.filial(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("MRTId")){
                try {
                    execute(myBotService.filial(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("UZIId")){
                try {
                    execute(myBotService.filial(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("RENTGENId")){
                try {
                    execute(myBotService.filial(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("MutaxassislarId")){
                try {
                    execute(myBotService.filial(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("QaytishToQabulId")){
                try {
                    execute(myBotService.qabul(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("ShoxMedCenterId")){
                try {
                    execute(myBotService.qabulTel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("ShoxIntHospitalId")){
                try {
                    execute(myBotService.qabulTel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("MedZdarSemyaId")){
                try {
                    execute(myBotService.qabulTel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("ShoxPediatriyaId")){
                try {
                    execute(myBotService.qabulTel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public String getBotUsername() {
        return "shoxMed11ABot";
    }

    @Override
    public String getBotToken() {
        return "7504459639:AAHxXDImUxBMORIQkEtfm2yur_RG1yDtkE8";
    }
}
