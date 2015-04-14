package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateX implements State {
    KwotaDataStateMachine kdsm;

    public StateX(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
        switch (s) {
            case '1':
                kdsm.setState(kdsm.getStateY());
                break;
            case ' ':
                kdsm.setState(kdsm.getStateD());
                break;
            case '.':
            case ',':
                kdsm.setState(kdsm.getStateE());
                break;
            case '-':
            case '/':
                kdsm.setState(kdsm.getStateZ());
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
