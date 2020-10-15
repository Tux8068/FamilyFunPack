package family_fun_pack.commands;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@SideOnly(Side.CLIENT)
public class Commands {
  private Map<String, Command> commands;

  public Commands() {
    this.commands = new HashMap<String, Command>();
    this.registerCommand(new DiffCommand());
    this.registerCommand(new GetCommand());
    this.registerCommand(new UseCommand());
    this.registerCommand(new VanishCommand());
    this.registerCommand(new VClipCommand());
    this.registerCommand(new HClipCommand());
    this.registerCommand(new RaytraceCommand());
    this.registerCommand(new UnloadedRideCommand());
    this.registerCommand(new StalkCommand());
  }

  public void registerCommand(Command cmd) {
    this.commands.put(cmd.getName(), cmd);
  }

  public Command getCommand(String name) {
    return this.commands.get(name);
  }

  public Collection<Command> getCommands() {
    return this.commands.values();
  }
}