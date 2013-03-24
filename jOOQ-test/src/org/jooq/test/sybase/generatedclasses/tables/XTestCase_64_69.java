/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class XTestCase_64_69 extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 404413801;

	/**
	 * The singleton instance of <code>DBA.x_test_case_64_69</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The column <code>DBA.x_test_case_64_69.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>DBA.x_test_case_64_69.UNUSED_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>DBA.x_test_case_64_69</code> table reference
	 */
	public XTestCase_64_69() {
		super("x_test_case_64_69", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * Create an aliased <code>DBA.x_test_case_64_69</code> table reference
	 */
	public XTestCase_64_69(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record> getPrimaryKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_64_69__PK_X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sybase.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69A, org.jooq.test.sybase.generatedclasses.Keys.X_TEST_CASE_64_69__FK_X_TEST_CASE_64_69B);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.XTestCase_64_69(alias);
	}
}
