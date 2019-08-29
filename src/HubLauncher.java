import java.io.File;

import org.openqa.grid.internal.utils.configuration.GridHubConfiguration;
import org.openqa.grid.web.Hub;

public class HubLauncher {

	public static Hub hub;

	public static void hubServer() {
		try {
			GridHubConfiguration gridHubConfig = new GridHubConfiguration();
			File JSONFile = new File("hubConfig.json");
			gridHubConfig = GridHubConfiguration.loadFromJSON(JSONFile.toString());
			hub = new Hub(gridHubConfig);
			hub.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		hubServer();
	}
}
