package org.dromara.hutool.core.tuple;

/**
 * 不可变三元组对象
 *
 * @param <L> 左值类型
 * @param <M> 中值类型
 * @param <R> 右值类型
 * @author kirno7
 * @since 6.0.0
 */
public class ImmutableTriple<L, M, R> extends Triple<L, M, R> {
	private static final long serialVersionUID = 1L;

	protected final L left;
	protected final M middle;
	protected final R right;

	/**
	 * 构建ImmutableTriple对象
	 *
	 * @param <L>    左值类型
	 * @param <M>    中值类型
	 * @param <R>    右值类型
	 * @param left   左值
	 * @param middle 中值
	 * @param right  右值
	 * @return ImmutableTriple
	 * @since 6.0.0
	 */
	public static <L, M, R> ImmutableTriple<L, M, R> of(L left, M middle, R right) {
		return new ImmutableTriple<>(left, middle, right);
	}

	/**
	 * 构造
	 *
	 * @param left   左值
	 * @param middle 中值
	 * @param right  右值
	 */
	private ImmutableTriple(L left, M middle, R right) {
		this.left = left;
		this.middle = middle;
		this.right = right;
	}

	/**
	 * 获取左值
	 *
	 * @return 左值
	 */
	@Override
	public L getLeft() {
		return this.left;
	}

	/**
	 * 获取中值
	 *
	 * @return 中值
	 */
	@Override
	public M getMiddle() {
		return this.middle;
	}

	/**
	 * 获取右值
	 *
	 * @return 右值
	 */
	@Override
	public R getRight() {
		return this.right;
	}
}