/*
 * generated by Xtext
 */
package mdse.book;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SWMLUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return mdse.book.ui.internal.SWMLActivator.getInstance().getInjector("mdse.book.SWML");
	}
	
}
