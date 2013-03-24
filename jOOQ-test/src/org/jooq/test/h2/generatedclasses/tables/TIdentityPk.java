/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TIdentityPk extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = -1938578501;

	/**
	 * The singleton instance of <code>PUBLIC.T_IDENTITY_PK</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TIdentityPk T_IDENTITY_PK = new org.jooq.test.h2.generatedclasses.tables.TIdentityPk();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_IDENTITY_PK.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY_PK);

	/**
	 * The column <code>PUBLIC.T_IDENTITY_PK.VAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, T_IDENTITY_PK);

	/**
	 * No further instances allowed
	 */
	private TIdentityPk() {
		super("T_IDENTITY_PK", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.h2.generatedclasses.Keys.IDENTITY_T_IDENTITY_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord> getPrimaryKey() {
		return org.jooq.test.h2.generatedclasses.Keys.PK_T_IDENTITY_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TIdentityPkRecord>>asList(org.jooq.test.h2.generatedclasses.Keys.PK_T_IDENTITY_PK);
	}
}
