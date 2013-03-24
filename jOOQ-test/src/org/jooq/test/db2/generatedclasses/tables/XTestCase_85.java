/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85 extends org.jooq.impl.TableImpl<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = -278689192;

	/**
	 * The singleton instance of <code>LUKAS.X_TEST_CASE_85</code>
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.db2.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The column <code>LUKAS.X_TEST_CASE_85.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The column <code>LUKAS.X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("X_UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The column <code>LUKAS.X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("X_UNUSED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("X_TEST_CASE_85", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record> getPrimaryKey() {
		return org.jooq.test.db2.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.db2.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.db2.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.db2.generatedclasses.Keys.X_TEST_CASE_85__FK_X_TEST_CASE_85);
	}
}
