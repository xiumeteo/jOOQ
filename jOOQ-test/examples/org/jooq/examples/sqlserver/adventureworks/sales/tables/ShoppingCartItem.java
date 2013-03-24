/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ShoppingCartItem extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> {

	private static final long serialVersionUID = 686662534;

	/**
	 * The singleton instance of <code>Sales.ShoppingCartItem</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem ShoppingCartItem = new org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem.class;
	}

	/**
	 * The column <code>Sales.ShoppingCartItem.ShoppingCartItemID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> ShoppingCartItemID = createField("ShoppingCartItemID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.ShoppingCartItem.ShoppingCartID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.String> ShoppingCartID = createField("ShoppingCartID", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Sales.ShoppingCartItem.Quantity</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> Quantity = createField("Quantity", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.ShoppingCartItem.ProductID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.ShoppingCartItem.DateCreated</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.sql.Timestamp> DateCreated = createField("DateCreated", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>Sales.ShoppingCartItem.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Sales.ShoppingCartItem</code> table reference
	 */
	public ShoppingCartItem() {
		super("ShoppingCartItem", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * Create an aliased <code>Sales.ShoppingCartItem</code> table reference
	 */
	public ShoppingCartItem(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem.ShoppingCartItem);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_ShoppingCartItem;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_ShoppingCartItem_ShoppingCartItemID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_ShoppingCartItem_ShoppingCartItemID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.ShoppingCartItem, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_ShoppingCartItem_Product_ProductID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.ShoppingCartItem(alias);
	}
}
