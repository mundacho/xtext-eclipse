/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.syntaxcoloring;

import java.util.List;

import org.eclipse.xtext.ide.editor.syntaxcoloring.LightweightPosition;
import org.eclipse.xtext.resource.XtextResource;

/**
 * Accepts a bunch of positions and creates a list
 * of positions from them that do not overlap.
 * 
 * @deprecated use {@link org.eclipse.xtext.ide.editor.syntaxcoloring.MergingHighlightedPositionAcceptor} instead.
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@Deprecated
public class MergingHighlightedPositionAcceptor extends org.eclipse.xtext.ide.editor.syntaxcoloring.MergingHighlightedPositionAcceptor implements IHighlightedPositionAcceptor, ISemanticHighlightingCalculator {

	/**
	 * @since 2.9
	 */
	static class Adapter implements org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator {

		private ISemanticHighlightingCalculator delegate;
		
		public Adapter(ISemanticHighlightingCalculator delegate) {
			this.delegate = delegate;
		}
		
		@Override
		public void provideHighlightingFor(XtextResource resource,
				org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
			delegate.provideHighlightingFor(resource, cast(acceptor));
		}
		
		private IHighlightedPositionAcceptor cast(org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
			return (IHighlightedPositionAcceptor) acceptor;
		}
		
	}
	
	/**
	 * @since 2.9
	 */
	public MergingHighlightedPositionAcceptor(org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator delegate) {
		super(delegate);
	}
	
	public MergingHighlightedPositionAcceptor(ISemanticHighlightingCalculator delegate) {
		super(new Adapter(delegate));
	}
	
	/**
	 * @since 2.9
	 */
	@Override
	public void provideHighlightingFor(XtextResource resource, org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		provideHighlightingFor(resource, cast(acceptor));
	}
	
	/**
	 * @since 2.9
	 */
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		super.provideHighlightingFor(resource, acceptor);
	}
	
	private IHighlightedPositionAcceptor cast(org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor acceptor) {
		return (IHighlightedPositionAcceptor) acceptor;
	}
	
	/*
	 * Overridden to befriend the API tooling.
	 */
	@Override
	public void mergePositions() {
		super.mergePositions();
	}
	
	/*
	 * Overridden to befriend the API tooling.
	 */
	@Override
	public List<LightweightPosition> getPositions() {
		return super.getPositions();
	}
	
	/*
	 * Overridden to befriend the API tooling.
	 */
	@Override
	public void addPosition(int offset, int length, String... ids) {
		super.addPosition(offset, length, ids);
	}
	
	/**
	 * @since 2.9
	 */
	@Override
	protected LightweightPosition newPosition(int offset, int length, int timestamp, org.eclipse.xtext.ide.editor.syntaxcoloring.LightweightPosition.IntToStringArray[] ids) {
		return new org.eclipse.xtext.ui.editor.syntaxcoloring.LightweightPosition(offset, length, timestamp, 
				(org.eclipse.xtext.ui.editor.syntaxcoloring.LightweightPosition.IntToStringArray[])ids);
	}
	
	/**
	 * @since 2.9
	 */
	@Override
	protected LightweightPosition newPosition(int offset, int length, int timestamp, String... ids) {
		return new org.eclipse.xtext.ui.editor.syntaxcoloring.LightweightPosition(offset, length, timestamp, ids);
	}
	
}
