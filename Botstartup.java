package Main;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Botstartup {
	public static void main(String[] args) throws LoginException {
		JDABuilder jda =  JDABuilder.createDefault("MTAzMjc0MTc3MDI2NzcyMTcyOQ.G7V85x.UnKV_YRDj_JAvtgLOmXq4jWy5GrLE96cWI4HtE");
		jda.setActivity(Activity.listening("!test"));
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new Commands());
		jda.build();
		
	}
}
