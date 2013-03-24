/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85 extends org.jooq.impl.TableImpl<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 1730011677;

	/**
	 * The singleton instance of dbo.x_test_case_85
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.ase.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The table column <code>dbo.x_test_case_85.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The table column <code>dbo.x_test_case_85.x_unused_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT x_test_case_85__fk_x_test_case_85
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES dbo.x_unused (ID, NAME)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * The table column <code>dbo.x_test_case_85.x_unused_name</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT x_test_case_85__fk_x_test_case_85
	 * FOREIGN KEY (x_unused_id, x_unused_name)
	 * REFERENCES dbo.x_unused (ID, NAME)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("x_test_case_85", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record> getPrimaryKey() {
		return org.jooq.test.ase.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.ase.generatedclasses.Keys.X_TEST_CASE_85__PK_X_TEST_CASE_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.ase.generatedclasses.Keys.X_TEST_CASE_85__FK_X_TEST_CASE_85);
	}
}
