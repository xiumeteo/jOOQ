/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 1692103730;

	/**
	 * The singleton instance of <code>TEST.T_EXOTIC_TYPES</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.UU</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID, this);

	/**
	 * Create a <code>TEST.T_EXOTIC_TYPES</code> table reference
	 */
	public TExoticTypes() {
		super("T_EXOTIC_TYPES", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.T_EXOTIC_TYPES</code> table reference
	 */
	public TExoticTypes(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes.T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TExoticTypesRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_EXOTIC_TYPES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes(alias);
	}
}
