import command.Respond;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws Exception {
        JDA jda = JDABuilder.createDefault("OTA2NDE2MjIyMTUxNzk4ODE1.YYYT4w.9kCJfnW74f--uDYwCP8u1c9ZZdI").build();

        jda.addEventListener(new Respond());
        jda.awaitReady();

    }
}
