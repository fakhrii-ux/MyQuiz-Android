package easy.tuto.myquizapplication;

public class QuestionAnswer {

    public static String question[] ={
            "Which company owns the android?",
            "Lequel des composants android suivants affiche la partie d’une activité à l’écran ?",
            "Quel protocole utilise le mode connecté?",
            "Laquelle de ces exceptions est levée par  remote method ?"
    };

    public static String choices[][] = {
            {"Google","Apple","Nokia","Samsung"},
            {"Vue","Manifeste","Intent","Fragment"},
            {"TCP","UDP","POP","FTP"},
            {"InputOutputException","RemoteException","RemoteAccessException","RemoteInputOutputException"}
    };

    public static String correctAnswers[] = {
            "Google",
            "Fragment",
            "TCP",
            "RemoteException"
    };

}
