package adapter;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.dataDiNascita(new Date(90, 5, 15)); // 15 giugno 1990

        DataSource adapter = new InfoAdapter(info);
        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
