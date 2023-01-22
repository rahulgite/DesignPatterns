package design.patterns.behavioural.chain.of.responsibility;
public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}