import commands.*;
import itemsForControl.*;
import rooms.RoomsEnum;

/**
 * Created by Professional on 2018-01-11.
 */
public class MiniRemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light lightDiningRoom = new Light(RoomsEnum.DINING_ROOM);
        CommandTurnOnLight commandTurnOnLightDiningRoom = new CommandTurnOnLight(lightDiningRoom);
        CommandTundOffLight commandTundOffLightDiningRoom = new CommandTundOffLight(lightDiningRoom);

        Light lightLivingRoom = new Light(RoomsEnum.LIVING_ROOM);
        CommandTurnOnLight commandTurnOnLightLivingRoom = new CommandTurnOnLight(lightLivingRoom);
        CommandTundOffLight commandTundOffLightLivingRoom = new CommandTundOffLight(lightLivingRoom);

        GarageDoor garageDoor = new GarageDoor();
        CommandGarageDoorUp commandGarageDoorUp = new CommandGarageDoorUp(garageDoor);
        CommandGarageDoorDown commandGarageDoorDown = new CommandGarageDoorDown(garageDoor);

        Stereo stereoDiningRoom = new Stereo(RoomsEnum.DINING_ROOM);
        CommandStereoCDTurnOn commandStereoCDTurnOnDiningRoom = new CommandStereoCDTurnOn(stereoDiningRoom);
        CommandStereoCDTurnOff commandStereoCDTurnOffDiningRoom = new CommandStereoCDTurnOff(stereoDiningRoom);

        Stereo stereoLivingRoom = new Stereo(RoomsEnum.LIVING_ROOM);
        CommandStereoCDTurnOn commandStereoCDTurnOnLivingRoom = new CommandStereoCDTurnOn(stereoLivingRoom);
        CommandStereoCDTurnOff commandStereoCDTurnOffLivingRoom = new CommandStereoCDTurnOff(stereoLivingRoom);

        CeilingFan ceilingFanLivingRoom = new CeilingFan(RoomsEnum.LIVING_ROOM);
        CommandCeilingFanTurnOnFast commandCeilingFanTurnOnFastLivingRoom = new CommandCeilingFanTurnOnFast(ceilingFanLivingRoom);
        CommandCeilingFanTurnOff commandCeilingFanTurnOffLivingRoom = new CommandCeilingFanTurnOff(ceilingFanLivingRoom);

        MacroComand macroCommandBackToHome = new MacroComand();
        macroCommandBackToHome.getCommands().add(commandGarageDoorUp);
        macroCommandBackToHome.getCommands().add(commandCeilingFanTurnOnFastLivingRoom);
        macroCommandBackToHome.getCommands().add(commandStereoCDTurnOnLivingRoom);
        macroCommandBackToHome.getCommands().add(commandTurnOnLightLivingRoom);

        MacroComand macroCommandGoingOut = new MacroComand();
        macroCommandGoingOut.getCommands().add(commandGarageDoorDown);
        macroCommandGoingOut.getCommands().add(commandTundOffLightDiningRoom);
        macroCommandGoingOut.getCommands().add(commandTundOffLightLivingRoom);
        macroCommandGoingOut.getCommands().add(commandStereoCDTurnOffDiningRoom);
        macroCommandGoingOut.getCommands().add(commandStereoCDTurnOffLivingRoom);
        macroCommandGoingOut.getCommands().add(commandCeilingFanTurnOffLivingRoom);



        simpleRemoteControl.setCommandsInSlot(0, commandTurnOnLightDiningRoom, commandTundOffLightDiningRoom);
        simpleRemoteControl.setCommandsInSlot(1, commandTurnOnLightLivingRoom, commandTundOffLightLivingRoom);
        simpleRemoteControl.setCommandsInSlot(2, commandGarageDoorUp, commandGarageDoorDown);
        simpleRemoteControl.setCommandsInSlot(3, commandStereoCDTurnOnDiningRoom, commandStereoCDTurnOffDiningRoom);
        simpleRemoteControl.setCommandsInSlot(4, commandStereoCDTurnOnLivingRoom, commandStereoCDTurnOffLivingRoom);
        simpleRemoteControl.setCommandsInSlot(5, commandCeilingFanTurnOnFastLivingRoom, commandCeilingFanTurnOffLivingRoom);
        simpleRemoteControl.setCommandsInSlot(6, macroCommandBackToHome, macroCommandGoingOut);

        simpleRemoteControl.onButtonWasPushed(0);
        simpleRemoteControl.onButtonWasPushed(1);
        simpleRemoteControl.onButtonWasPushed(2);
        simpleRemoteControl.onButtonWasPushed(3);
        simpleRemoteControl.onButtonWasPushed(4);
        simpleRemoteControl.onButtonWasPushed(5);
        simpleRemoteControl.onButtonWasPushed(6);

        simpleRemoteControl.offButtonWasPushed(0);
        simpleRemoteControl.offButtonWasPushed(1);
        simpleRemoteControl.offButtonWasPushed(2);
        simpleRemoteControl.offButtonWasPushed(3);
        simpleRemoteControl.offButtonWasPushed(4);
        simpleRemoteControl.offButtonWasPushed(5);
        simpleRemoteControl.offButtonWasPushed(6);
    }
}
