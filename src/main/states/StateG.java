package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateG implements State {
    KwotaDataStateMachine kdsm;

    public StateG(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case '1':
                kdsm.setState(kdsm.getStateX());
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
