/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VendorAddress extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress> {

	private static final long serialVersionUID = 707791411;

	/**
	 * The singleton instance of <code>Purchasing.VendorAddress</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress VendorAddress = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress.class;
	}

	/**
	 * The column <code>Purchasing.VendorAddress.VendorID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress, java.lang.Integer> VendorID = createField("VendorID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Purchasing.VendorAddress.AddressID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress, java.lang.Integer> AddressID = createField("AddressID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Purchasing.VendorAddress.AddressTypeID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress, java.lang.Integer> AddressTypeID = createField("AddressTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Purchasing.VendorAddress.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Purchasing.VendorAddress</code> table reference
	 */
	public VendorAddress() {
		super("VendorAddress", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing);
	}

	/**
	 * Create an aliased <code>Purchasing.VendorAddress</code> table reference
	 */
	public VendorAddress(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.Purchasing, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress.VendorAddress);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_VendorAddress_VendorID_AddressID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_VendorAddress_VendorID_AddressID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorAddress, ?>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_VendorAddress_Vendor_VendorID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_VendorAddress_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.FK_VendorAddress_AddressType_AddressTypeID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.VendorAddress(alias);
	}
}
