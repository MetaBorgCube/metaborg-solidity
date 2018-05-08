package org.metaborg.lang.solidity.strategies;

import java.math.BigInteger;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class sol_bigint2_mult_0_2 extends Strategy {
	public static final sol_bigint2_mult_0_2 instance = new sol_bigint2_mult_0_2();
	
	private sol_bigint2_mult_0_2() {}
	
	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current, IStrategoTerm nrTerm, IStrategoTerm multTerm) {
		BigInteger number = BigIntHelper.toBigInt(nrTerm);
		BigInteger multiplier = BigIntHelper.toBigInt(multTerm);

		String result = number.multiply(multiplier).toString();
		return context.getFactory().makeString(result);
	}
}
