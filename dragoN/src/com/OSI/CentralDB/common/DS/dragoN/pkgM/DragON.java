/**
 * 
 */
package com.OSI.CentralDB.common.DS.dragoN.pkgM;

/**
 * @author anon_alexdos2010m
 *
 */
public interface DragON {
	default void rmiCall() {
		System.out.println("Call to>>");
	};
	default void rmiSearch() {
		System.out.println("Searching For...");

	};
	default void delete() {
		System.out.println("Deleting File...");

	};
	public default void install() {
		System.out.println("Installing Software...");
	};
	default void uninstsall() {
		System.out.println("Uninstalling file...");
	}; 
	public default void pkg_depends() {
		System.out.println("Checking package dependency...");
	}

}
