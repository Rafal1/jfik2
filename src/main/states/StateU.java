package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateU implements State {
    KwotaDataStateMachine kdsm;

    public StateU(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case '1':
                kdsm.setState(kdsm.getStateW());
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
