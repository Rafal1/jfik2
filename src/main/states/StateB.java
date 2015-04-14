package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateB implements State {
    KwotaDataStateMachine kdsm;

    public StateB(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case '1':
                kdsm.setState(kdsm.getStateC());
                break;
            case ' ':
                kdsm.setState(kdsm.getStateD());
                break;
            case '.':
            case ',':
                kdsm.setState(kdsm.getStateE());
                break;
            default:
                kdsm.resetMachine();
        }
    }

    @Override
    public Boolean isAcceptable() {
        return false;
    }

}
