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
public class tagEdsVolumeInfo extends Structure {
	/** C type : EdsUInt32 */
	public NativeLong storageType;
	/**
	 * @see EdsAccess<br>
	 * C type : EdsAccess
	 */
	public int access;
	/** C type : EdsUInt64 */
	public long maxCapacity;
	/** C type : EdsUInt64 */
	public long freeSpaceInBytes;
	/** C type : EdsChar[256] */
	public byte[] szVolumeLabel = new byte[256];
	public tagEdsVolumeInfo() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("storageType", "access", "maxCapacity", "freeSpaceInBytes", "szVolumeLabel");
	}
	/**
	 * @param storageType C type : EdsUInt32<br>
	 * @param access @see EdsAccess<br>
	 * C type : EdsAccess<br>
	 * @param maxCapacity C type : EdsUInt64<br>
	 * @param freeSpaceInBytes C type : EdsUInt64<br>
	 * @param szVolumeLabel C type : EdsChar[256]
	 */
	public tagEdsVolumeInfo(NativeLong storageType, int access, long maxCapacity, long freeSpaceInBytes, byte szVolumeLabel[]) {
		super();
		this.storageType = storageType;
		this.access = access;
		this.maxCapacity = maxCapacity;
		this.freeSpaceInBytes = freeSpaceInBytes;
		if ((szVolumeLabel.length != this.szVolumeLabel.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szVolumeLabel = szVolumeLabel;
	}
	public tagEdsVolumeInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagEdsVolumeInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends tagEdsVolumeInfo implements Structure.ByValue {
		
	};
}