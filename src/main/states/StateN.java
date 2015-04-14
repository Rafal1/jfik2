package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateN implements State {
    KwotaDataStateMachine kdsm;

    public StateN(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case 'ł':
                kdsm.setState(kdsm.getStateO());
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
