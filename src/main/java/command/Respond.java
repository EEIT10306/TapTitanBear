package command;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Respond extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw(); // 所有訊息
        String userName = event.getAuthor().getName();
        if (message.equals("-陽")) {
            event.getChannel().sendMessage(userName + ": 誰准你叫了！").queue();
        }
    }

}
