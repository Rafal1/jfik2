package main.states;

/**
 * @author Rafał Zawadzki
 */
public interface State {

    public Boolean isAcceptable();

    public void goBySymbol(Character s);

}
