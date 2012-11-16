/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.ui.editor.outline.impl;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.label.AbstractLabelProvider;

import com.google.inject.Inject;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class OutlineNodeLabelProvider extends DelegatingStyledCellLabelProvider implements ILabelProvider {

	@Inject
	public OutlineNodeLabelProvider(Delegate delegate) {
		super(delegate);
	}

	public static class Delegate extends AbstractLabelProvider {

		@Inject
		private IImageHelper imageHelper;

		@Override
		protected Object doGetText(Object element) {
			if (element instanceof IOutlineNode) {
				return ((IOutlineNode) element).getText();
			}
			return super.doGetText(element);
		}

		@Override
		protected Object doGetImage(Object element) {
			if (element instanceof IOutlineNode) {
				return ((IOutlineNode) element).getImage();
			}
			return super.doGetImage(element);
		}

		@Override
		protected Object getDefaultImage() {
			return imageHelper.getImage("defaultoutlinenode.gif");
		}

		@Override
		protected String getDefaultText() {
			return "<null>";
		}

		@Override
		public Image getImage(Object element) {
			return super.getImage(element);
		}

		@Override
		public String getText(Object element) {
			return super.getText(element);
		}
	}

	public String getText(Object element) {
		final StyledString styledText = getStyledText(element);
		return styledText != null? styledText.toString() : null;
	}
}
