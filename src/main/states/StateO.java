package main.states;

import main.KwotaDataStateMachine;

/**
 * @author Rafał Zawadzki
 */
public class StateO implements State {
    KwotaDataStateMachine kdsm;

    public StateO(KwotaDataStateMachine k) {
        kdsm = k;
    }

    @Override
    public void goBySymbol(Character s) {
    }

    @Override
    public Boolean isAcceptable() {
        kdsm.isCompleted = true;
        kdsm.token = "<KWOTA>";
        return true;
    }
}
