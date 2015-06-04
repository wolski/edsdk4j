package edsdk.bindings;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : D:\ims_archive\C++\SDK\ED-SDK\Ver215\EDSDK\Header\EDSDKTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagEdsPoint extends Structure {
	/** C type : EdsInt32 */
	public NativeLong x;
	/** C type : EdsInt32 */
	public NativeLong y;
	public tagEdsPoint() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("x", "y");
	}
	/**
	 * @param x C type : EdsInt32<br>
	 * @param y C type : EdsInt32
	 */
	public tagEdsPoint(NativeLong x, NativeLong y) {
		super();
		this.x = x;
		this.y = y;
	}
	public tagEdsPoint(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagEdsPoint implements Structure.ByReference {
		
	};
	public static class ByValue extends tagEdsPoint implements Structure.ByValue {
		
	};
}
