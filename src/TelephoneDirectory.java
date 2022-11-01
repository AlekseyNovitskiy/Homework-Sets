import java.util.HashMap;

public class TelephoneDirectory {
    private final HashMap<String, String>  mapPhone = new HashMap<>();


    public TelephoneDirectory() {
        mapPhone.put("Сергей И.", "+79449349394");
        mapPhone.put("Татьяна Ю.", "+7945-445-3444");
        mapPhone.put("Александр И.", "89465986657");
        mapPhone.put("Иванов И.", "+79454715345");
        mapPhone.put("Соколов И.", "+76452875464");
        mapPhone.put("Петров И.", "+79567345354");
        mapPhone.put("Юлия И.", "83343423425");
        mapPhone.put("Назика И.", "+57534345345");
        mapPhone.put("Олег И.", "+74534543753");
        mapPhone.put("Дмитрий И.", "+34534534345");
        mapPhone.put("Максим И.", "94341345344");
        mapPhone.put("Александра И.", "+75434175342");
        mapPhone.put("Полина И.", "+83123453431");
        mapPhone.put("Галина И.", "+7331312453");
        mapPhone.put("Людмила И.", "+93423431234");
        mapPhone.put("Татьяна И.", "+87934213455");
        mapPhone.put("Маша И.", "+45734213564");
        mapPhone.put("София И.", "+87931257632");
        mapPhone.put("Ирина И.", "+89314546313");
        mapPhone.put("Екатерина И.", "84562123422");
    }

    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "mapPhone=" + mapPhone +
                '}';
    }

}
