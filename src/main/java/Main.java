import command.Respond;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception {
        initProperties();

        JDA jda = JDABuilder.createDefault(System.getProperty("discord.token")).build();

        jda.addEventListener(new Respond());
        jda.awaitReady();

    }

    public static void initProperties() throws IOException {
        FileInputStream propFile = new FileInputStream( "config.properties");
        Properties p = new Properties(System.getProperties());
        p.load(propFile);

        // set the system properties
        System.setProperties(p);
        // display new properties
        System.getProperties().list(System.out);
    }

}
