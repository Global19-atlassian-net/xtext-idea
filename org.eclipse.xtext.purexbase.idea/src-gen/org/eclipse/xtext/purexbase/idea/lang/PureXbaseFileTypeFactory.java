/*
 * generated by Xtext
 */
package org.eclipse.xtext.purexbase.idea.lang;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class PureXbaseFileTypeFactory extends FileTypeFactory {

	@Override
	public void createFileTypes(@NotNull FileTypeConsumer consumer) {
		consumer.consume(PureXbaseFileType.INSTANCE, AbstractPureXbaseFileType.DEFAULT_EXTENSION);
	}

}
