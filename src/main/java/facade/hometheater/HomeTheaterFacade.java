package hometheater;

/**
 * Created by Professional on 2018-01-14.
 */
public class HomeTheaterFacade implements HomeTheaterInterface{

    Amplifier amplifier;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    TheaterLights theaterLights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, CdPlayer cdPlayer, DvdPlayer dvdPlayer,
                             PopcornPopper popcornPopper, Projector projector, Screen screen,
                             TheaterLights theaterLights, Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    @Override
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    @Override
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    @Override
    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(8);
        amplifier.setCd(cdPlayer);
        cdPlayer.on();
        cdPlayer.play(cdTitle);
        cdPlayer.play(0);
    }

    @Override
    public void endCd() {
        System.out.println("Shutting down CD...");
        amplifier.off();
        theaterLights.on();
        cdPlayer.stop();
        cdPlayer.eject();
        cdPlayer.off();
    }

    @Override
    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        amplifier.on();
        amplifier.setVolume(5);
        amplifier.setSurroundSound();
        amplifier.setTuner(tuner);
        tuner.on();
        tuner.setFrequency(frequency);
    }

    @Override
    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amplifier.off();
    }
}
