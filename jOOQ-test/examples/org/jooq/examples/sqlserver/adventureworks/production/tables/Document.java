/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Document extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document> {

	private static final long serialVersionUID = -291693104;

	/**
	 * The singleton instance of <code>Production.Document</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Document Document = new org.jooq.examples.sqlserver.adventureworks.production.tables.Document();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document.class;
	}

	/**
	 * The column <code>Production.Document.DocumentID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.Integer> DocumentID = createField("DocumentID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.Document.Title</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.String> Title = createField("Title", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.Document.FileName</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.String> FileName = createField("FileName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.Document.FileExtension</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.String> FileExtension = createField("FileExtension", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.Document.Revision</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.String> Revision = createField("Revision", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * The column <code>Production.Document.ChangeNumber</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.Integer> ChangeNumber = createField("ChangeNumber", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Production.Document.Status</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.Byte> Status = createField("Status", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>Production.Document.DocumentSummary</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.String> DocumentSummary = createField("DocumentSummary", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The column <code>Production.Document.Document</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, byte[]> Document_ = createField("Document", org.jooq.impl.SQLDataType.VARBINARY, this);

	/**
	 * The column <code>Production.Document.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Production.Document</code> table reference
	 */
	public Document() {
		super("Document", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.Document</code> table reference
	 */
	public Document(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_Document;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Document_DocumentID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Document_DocumentID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Document as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Document(alias);
	}
}
