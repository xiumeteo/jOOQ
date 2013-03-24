/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TAuthor extends org.jooq.impl.TableImpl<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 1028093193;

	/**
	 * The singleton instance of <code>TEST.T_AUTHOR</code>
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.derby.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>TEST.T_AUTHOR.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>TEST.T_AUTHOR.FIRST_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * The column <code>TEST.T_AUTHOR.LAST_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * The column <code>TEST.T_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, T_AUTHOR);

	/**
	 * The column <code>TEST.T_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>TEST.T_AUTHOR.ADDRESS</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("T_AUTHOR", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord> getPrimaryKey() {
		return org.jooq.test.derby.generatedclasses.Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.derby.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.derby.generatedclasses.Keys.PK_T_AUTHOR);
	}
}
