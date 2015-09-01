/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.tmoerman.adam.fx.avro;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface EFFECTS {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"EFFECTS\",\"namespace\":\"org.tmoerman.adam.fx.avro\",\"types\":[{\"type\":\"record\",\"name\":\"Contig\",\"namespace\":\"org.bdgenomics.formats.avro\",\"doc\":\"Record for describing a reference assembly. Not used for storing the contents\\n of said assembly.\\n\\n @see NucleotideContigFragment\",\"fields\":[{\"name\":\"contigName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of this contig in the assembly (e.g., \\\"chr1\\\").\",\"default\":null},{\"name\":\"contigLength\",\"type\":[\"null\",\"long\"],\"doc\":\"The length of this contig.\",\"default\":null},{\"name\":\"contigMD5\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The MD5 checksum of the assembly for this contig.\",\"default\":null},{\"name\":\"referenceURL\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The URL at which this reference assembly can be found.\",\"default\":null},{\"name\":\"assembly\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of this assembly (e.g., \\\"hg19\\\").\",\"default\":null},{\"name\":\"species\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The species that this assembly is for.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"AlignmentRecord\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"contig\",\"type\":[\"null\",\"Contig\"],\"doc\":\"The reference sequence details for the reference chromosome that\\n   this read is aligned to. If the read is unaligned, this field should\\n   be null.\",\"default\":null},{\"name\":\"start\",\"type\":[\"null\",\"long\"],\"doc\":\"0 based reference position for the start of this read's alignment.\\n   Should be null if the read is unaligned.\",\"default\":null},{\"name\":\"oldPosition\",\"type\":[\"null\",\"long\"],\"doc\":\"0 based reference position where this read used to start before\\n   local realignment.\\n   Stores the same data as the OP field in the SAM format.\",\"default\":null},{\"name\":\"end\",\"type\":[\"null\",\"long\"],\"doc\":\"0 based reference position for the end of this read's alignment.\\n   Should be null if the read is unaligned.\",\"default\":null},{\"name\":\"mapq\",\"type\":[\"null\",\"int\"],\"doc\":\"The global mapping quality of this read.\",\"default\":null},{\"name\":\"readName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The name of this read. This should be unique within the read group\\n   that this read is from, and can be used to identify other reads that\\n   are derived from a single fragment.\",\"default\":null},{\"name\":\"sequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The bases in this alignment. If the read has been hard clipped, this may\\n   not represent all the bases in the original read.\",\"default\":null},{\"name\":\"qual\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The per-base quality scores in this alignment. If the read has been hard\\n   clipped, this may not represent all the bases in the original read.\\n   Additionally, if the error scores have been recalibrated, this field\\n   will not contain the original base quality scores.\\n\\n   @see origQual\",\"default\":null},{\"name\":\"cigar\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The Compact Ideosyncratic Gapped Alignment Report (CIGAR) string that\\n   describes the local alignment of this read. Contains {length, operator}\\n   pairs for all contiguous alignment operations. The operators include:\\n   \\n   * M, ALIGNMENT_MATCH: An alignment match indicates that a sequence can be\\n     aligned to the reference without evidence of an INDEL. Unlike the\\n     SEQUENCE_MATCH and SEQUENCE_MISMATCH operators, the ALIGNMENT_MATCH\\n     operator does not indicate whether the reference and read sequences are an\\n     exact match.\\n   * I, INSERT: The insert operator indicates that the read contains evidence of\\n     bases being inserted into the reference.\\n   * D, DELETE: The delete operator indicates that the read contains evidence of\\n     bases being deleted from the reference.\\n   * N, SKIP: The skip operator indicates that this read skips a long segment of\\n     the reference, but the bases have not been deleted. This operator is\\n     commonly used when working with RNA-seq data, where reads may skip long\\n     segments of the reference between exons.\\n   * S, CLIP_SOFT: The soft clip operator indicates that bases at the start/end\\n     of a read have not been considered during alignment. This may occur if the\\n     majority of a read maps, except for low quality bases at the start/end of\\n     a read. Bases that are soft clipped will still be stored in the read.\\n   * H, CLIP_HARD: The hard clip operator indicates that bases at the start/end of\\n     a read have been omitted from this alignment. This may occur if this linear\\n     alignment is part of a chimeric alignment, or if the read has been trimmed\\n     (e.g., during error correction, or to trim poly-A tails for RNA-seq).\\n   * P, PAD: The pad operator indicates that there is padding in an alignment.\\n   * =, SEQUENCE_MATCH: This operator indicates that this portion of the aligned\\n     sequence exactly matches the reference (e.g., all bases are equal to the\\n     reference bases).\\n   * X, SEQUENCE_MISMATCH: This operator indicates that this portion of the \\n     aligned sequence is an alignment match to the reference, but a sequence\\n     mismatch (e.g., the bases are not equal to the reference). This can\\n     indicate a SNP or a read error.\",\"default\":null},{\"name\":\"oldCigar\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Stores the CIGAR string present before local indel realignment.\\n   Stores the same data as the OC field in the SAM format.\\n\\n   @see cigar\",\"default\":null},{\"name\":\"basesTrimmedFromStart\",\"type\":[\"int\",\"null\"],\"doc\":\"The number of bases in this read/alignment that have been trimmed from the\\n   start of the read. By default, this is equal to 0. If the value is non-zero,\\n   that means that the start of the read has been hard-clipped.\\n\\n   @see cigar\",\"default\":0},{\"name\":\"basesTrimmedFromEnd\",\"type\":[\"int\",\"null\"],\"doc\":\"The number of bases in this read/alignment that have been trimmed from the\\n   end of the read. By default, this is equal to 0. If the value is non-zero,\\n   that means that the end of the read has been hard-clipped.\\n\\n   @see cigar\",\"default\":0},{\"name\":\"readPaired\",\"type\":[\"boolean\",\"null\"],\"default\":false},{\"name\":\"properPair\",\"type\":[\"boolean\",\"null\"],\"default\":false},{\"name\":\"readMapped\",\"type\":[\"boolean\",\"null\"],\"default\":false},{\"name\":\"mateMapped\",\"type\":[\"boolean\",\"null\"],\"default\":false},{\"name\":\"firstOfPair\",\"type\":[\"boolean\",\"null\"],\"default\":false},{\"name\":\"secondOfPair\",\"type\":[\"boolean\",\"null\"],\"default\":false},{\"name\":\"failedVendorQualityChecks\",\"type\":[\"boolean\",\"null\"],\"default\":false},{\"name\":\"duplicateRead\",\"type\":[\"boolean\",\"null\"],\"default\":false},{\"name\":\"readNegativeStrand\",\"type\":[\"boolean\",\"null\"],\"doc\":\"True if this alignment is mapped as a reverse compliment. This field\\n   defaults to false.\",\"default\":false},{\"name\":\"mateNegativeStrand\",\"type\":[\"boolean\",\"null\"],\"doc\":\"True if the mate pair of this alignment is mapped as a reverse compliment.\\n   This field defaults to false.\",\"default\":false},{\"name\":\"primaryAlignment\",\"type\":[\"boolean\",\"null\"],\"doc\":\"This field is true if this alignment is either the best linear alignment,\\n   or the first linear alignment in a chimeric alignment. Defaults to false.\\n\\n   @see secondaryAlignment\\n   @see supplementaryAlignment\",\"default\":false},{\"name\":\"secondaryAlignment\",\"type\":[\"boolean\",\"null\"],\"doc\":\"This field is true if this alignment is a lower quality linear alignment\\n   for a multiply-mapped read. Defaults to false.\\n\\n   @see primaryAlignment\\n   @see supplementaryAlignment\",\"default\":false},{\"name\":\"supplementaryAlignment\",\"type\":[\"boolean\",\"null\"],\"doc\":\"This field is true if this alignment is a non-primary linear alignment in\\n   a chimeric alignment. Defaults to false.\\n\\n   @see primaryAlignment\\n   @see secondaryAlignment\",\"default\":false},{\"name\":\"mismatchingPositions\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"origQual\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"defa","ult\":null},{\"name\":\"attributes\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupSequencingCenter\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupRunDateEpoch\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"recordGroupFlowOrder\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupKeySequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupLibrary\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupPredictedMedianInsertSize\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"recordGroupPlatform\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupPlatformUnit\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"recordGroupSample\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"mateAlignmentStart\",\"type\":[\"null\",\"long\"],\"doc\":\"The start position of the mate of this read. Should be set to null if the\\n   mate is unaligned, or if the mate does not exist.\",\"default\":null},{\"name\":\"mateAlignmentEnd\",\"type\":[\"null\",\"long\"],\"doc\":\"The end position of the mate of this read. Should be set to null if the\\n   mate is unaligned, or if the mate does not exist.\",\"default\":null},{\"name\":\"mateContig\",\"type\":[\"null\",\"Contig\"],\"doc\":\"The reference contig of the mate of this read. Should be set to null if the\\n   mate is unaligned, or if the mate does not exist.\",\"default\":null}]},{\"type\":\"enum\",\"name\":\"Base\",\"namespace\":\"org.bdgenomics.formats.avro\",\"doc\":\"Enumeration for DNA/RNA bases. For codes outside of ACTGU, see the IUPAC \\n resolution codes (http://www.bioinformatics.org/sms/iupac.html).\",\"symbols\":[\"A\",\"C\",\"T\",\"G\",\"U\",\"N\",\"X\",\"K\",\"M\",\"R\",\"Y\",\"S\",\"W\",\"B\",\"V\",\"H\",\"D\"]},{\"type\":\"record\",\"name\":\"NucleotideContigFragment\",\"namespace\":\"org.bdgenomics.formats.avro\",\"doc\":\"Stores a contig of nucleotides; this may be a reference chromosome, may be an\\n assembly, may be a BAC. Very long contigs (>1Mbp) need to be split into fragments.\\n It seems that they are too long to load in a single go. For best performance,\\n it seems like 10kbp is a good point at which to start splitting contigs into\\n fragments.\",\"fields\":[{\"name\":\"contig\",\"type\":[\"null\",\"Contig\"],\"doc\":\"The contig identification descriptor for this contig.\",\"default\":null},{\"name\":\"description\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"A description for this contig. When importing from FASTA, the FASTA header\\n   description line should be stored here.\",\"default\":null},{\"name\":\"fragmentSequence\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The sequence of bases in this fragment.\",\"default\":null},{\"name\":\"fragmentNumber\",\"type\":[\"null\",\"int\"],\"doc\":\"In a fragmented contig, the position of this fragment in the set of fragments.\\n   Can be null if the contig is not fragmented.\",\"default\":null},{\"name\":\"fragmentStartPosition\",\"type\":[\"null\",\"long\"],\"doc\":\"The position of the first base of this fragment in the overall contig. E.g.,\\n   if all fragments are 10kbp and this is the third fragment in the contig,\\n   the start position would be 20000L.\",\"default\":null},{\"name\":\"numberOfFragmentsInContig\",\"type\":[\"null\",\"int\"],\"doc\":\"The total count of fragments that this contig has been broken into. Can be\\n   null if the contig is not fragmented.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"Pileup\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"contig\",\"type\":[\"null\",\"Contig\"],\"doc\":\"The reference contig that this pileup is mapped to.\",\"default\":null},{\"name\":\"position\",\"type\":[\"null\",\"long\"],\"doc\":\"The 0-based mapping position of this pileup on the reference contig.\",\"default\":null},{\"name\":\"rangeOffset\",\"type\":[\"null\",\"int\"],\"doc\":\"The range offset and range length fields are used when an insertion or\\n   deletion has occured. The range length indicates the length of the event\\n   and the range offset field indicates the location of this base in the\\n   insertion or deletion event.\",\"default\":null},{\"name\":\"rangeLength\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"referenceBase\",\"type\":[\"null\",\"Base\"],\"doc\":\"The base in the reference at this position.\",\"default\":null},{\"name\":\"readBase\",\"type\":[\"null\",\"Base\"],\"doc\":\"The read base at this position.\",\"default\":null},{\"name\":\"sampleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"sangerQuality\",\"type\":[\"null\",\"int\"],\"doc\":\"The Phred scaled base quality at this position.\",\"default\":null},{\"name\":\"mapQuality\",\"type\":[\"null\",\"int\"],\"doc\":\"The Phred scaled mapping quality of the read this pileup came from.\",\"default\":null},{\"name\":\"isReverseStrand\",\"type\":[\"boolean\",\"null\"],\"doc\":\"True if this base is on the reverse strand.\",\"default\":false}]},{\"type\":\"enum\",\"name\":\"StructuralVariantType\",\"namespace\":\"org.bdgenomics.formats.avro\",\"doc\":\"Descriptors for the type of a structural variant. The most specific descriptor\\n should be used, if possible. E.g., duplication should be used instead of\\n insertion if the inserted sequence is not novel. Tandem duplication should\\n be used instead of duplication if the duplication is known to follow the\\n duplicated sequence.\",\"symbols\":[\"DELETION\",\"INSERTION\",\"INVERSION\",\"MOBILE_INSERTION\",\"MOBILE_DELETION\",\"DUPLICATION\",\"TANDEM_DUPLICATION\"]},{\"type\":\"record\",\"name\":\"StructuralVariant\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"type\",\"type\":[\"null\",\"StructuralVariantType\"],\"doc\":\"The type of this structural variant.\",\"default\":null},{\"name\":\"assembly\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The URL of the FASTA/NucleotideContig assembly for this structural variant,\\n   if one is available.\",\"default\":null},{\"name\":\"precise\",\"type\":[\"boolean\",\"null\"],\"doc\":\"Whether this structural variant call has precise breakpoints or not. Default\\n   value is true. If the call is imprecise, confidence intervals should be provided.\",\"default\":true},{\"name\":\"startWindow\",\"type\":[\"null\",\"int\"],\"doc\":\"The size of the confidence window around the start of the structural variant.\",\"default\":null},{\"name\":\"endWindow\",\"type\":[\"null\",\"int\"],\"doc\":\"The size of the confidence window around the end of the structural variant.\",\"default\":null}]},{\"type\":\"record\",\"name\":\"Variant\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"contig\",\"type\":[\"null\",\"Contig\"],\"doc\":\"The reference contig that this variant exists on.\",\"default\":null},{\"name\":\"start\",\"type\":[\"null\",\"long\"],\"doc\":\"The 0-based start position of this variant on the reference contig.\",\"default\":null},{\"name\":\"end\",\"type\":[\"null\",\"long\"],\"doc\":\"The 0-based, exclusive end position of this variant on the reference contig.\",\"default\":null},{\"name\":\"referenceAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"A string describing the reference allele at this site.\",\"default\":null},{\"name\":\"alternateAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"A string describing the variant allele at this site. Should be left null if\\n   the site is a structural variant.\",\"default\":null},{\"name\":\"svAllele\",\"type\":[\"null\",\"StructuralVariant\"],\"doc\":\"The structural variant at this site, if the alternate allele is a structural\\n   variant. If the site is not a structural variant, this field should be left \\n   null.\",\"default\":null}]},{\"type\":\"enum\",\"name\":\"GenotypeAllele\",\"namespace\":\"org.bdgenomics.formats.avro\",\"doc\":\"An enumeration that describes the allele that corresponds to a genotype. Can take\\n the following values:\\n\\n * Ref: The genotype is the reference allele\\n * Alt: The genotype is the alternate allele\\n * OtherAlt: The genotype is an unspecified other alternate allele. This occurs\\n   in our schema when we have split a mu","lti-allelic genotype into two genotype\\n   records.\\n * NoCall: The genotype could not be called.\",\"symbols\":[\"Ref\",\"Alt\",\"OtherAlt\",\"NoCall\"]},{\"type\":\"enum\",\"name\":\"GenotypeType\",\"namespace\":\"org.bdgenomics.formats.avro\",\"doc\":\"An enumeration that describes the characteristics of a genotype at a site. Can\\n take the following values:\\n\\n * HOM_REF: All genotypes at this site were called as the reference allele.\\n * HET: Genotypes at this site were called as multiple different alleles. This\\n   most commonly occurs if a diploid sample's genotype contains one reference\\n   and one variant allele, but can also occur if the genotype contains multiple\\n   alternate alleles.\\n * HOM_ALT: All genotypes at this site were called as a single alternate allele.\\n * NO_CALL: The genotype could not be called at this site.\",\"symbols\":[\"HOM_REF\",\"HET\",\"HOM_ALT\",\"NO_CALL\"]},{\"type\":\"record\",\"name\":\"VariantCallingAnnotations\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"variantCallErrorProbability\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"variantIsPassing\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"variantFilters\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"readDepth\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"downsampled\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"baseQRankSum\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"clippingRankSum\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"fisherStrandBiasPValue\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"haplotypeScore\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"inbreedingCoefficient\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"rmsMapQ\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"mapq0Reads\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"mqRankSum\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"variantQualityByDepth\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"readPositionRankSum\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"vqslod\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"culprit\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"usedForNegativeTrainingSet\",\"type\":[\"null\",\"boolean\"],\"default\":null},{\"name\":\"usedForPositiveTrainingSet\",\"type\":[\"null\",\"boolean\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"FlatGenotype\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"referenceName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"position\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"referenceAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"alleles\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"default\":[]},{\"name\":\"genotypeLikelihoods\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]},{\"name\":\"alleleDepths\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"default\":[]},{\"name\":\"readDepth\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"genotypeQuality\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"sampleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]},{\"type\":\"record\",\"name\":\"Genotype\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"variant\",\"type\":\"Variant\",\"doc\":\"The variant called at this site.\"},{\"name\":\"variantCallingAnnotations\",\"type\":[\"null\",\"VariantCallingAnnotations\"],\"doc\":\"Statistics collected at this site, if available.\",\"default\":null},{\"name\":\"sampleId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The unique identifier for this sample.\",\"default\":null},{\"name\":\"sampleDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"A description of this sample.\",\"default\":null},{\"name\":\"processingDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"A string describing the provenance of this sample and the processing applied\\n   in genotyping this sample.\",\"default\":null},{\"name\":\"alleles\",\"type\":{\"type\":\"array\",\"items\":\"GenotypeAllele\"},\"doc\":\"An array describing the genotype called at this site. The length of this\\n   array is equal to the ploidy of the sample at this site. This array may\\n   reference OtherAlt alleles if this site is multi-allelic in this sample.\",\"default\":[]},{\"name\":\"expectedAlleleDosage\",\"type\":[\"null\",\"float\"],\"doc\":\"The expected dosage of the alternate allele in this sample.\",\"default\":null},{\"name\":\"referenceReadDepth\",\"type\":[\"null\",\"int\"],\"doc\":\"The number of reads that show evidence for the reference at this site.\\n   \\n   @see alternateReadDepth\\n   @see readDepth\",\"default\":null},{\"name\":\"alternateReadDepth\",\"type\":[\"null\",\"int\"],\"doc\":\"The number of reads that show evidence for this alternate allele at this site.\\n   \\n   @see referenceReadDepth\\n   @see readDepth\",\"default\":null},{\"name\":\"readDepth\",\"type\":[\"null\",\"int\"],\"doc\":\"The total number of reads at this site. May not equal (alternateReadDepth +\\n   referenceReadDepth) if this site shows evidence of multiple alternate alleles.\\n   \\n   @see referenceReadDepth\\n   @see alternateReadDepth\\n\\n   @note Analogous to VCF's DP.\",\"default\":null},{\"name\":\"minReadDepth\",\"type\":[\"null\",\"int\"],\"doc\":\"The minimum number of reads seen at this site across samples when joint\\n   calling variants.\\n\\n   @note Analogous to VCF's MIN_DP.\",\"default\":null},{\"name\":\"genotypeQuality\",\"type\":[\"null\",\"int\"],\"doc\":\"The phred-scaled probability that we're correct for this genotype call.\\n\\n   @note Analogous to VCF's GQ.\",\"default\":null},{\"name\":\"genotypeLikelihoods\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"doc\":\"Phred scaled likelihoods that we have n copies of this alternate allele.\\n   The number of elements in this array should be equal to the ploidy at this\\n   site, plus 1.\\n   \\n   @note Analogous to VCF's PL.\",\"default\":[]},{\"name\":\"nonReferenceLikelihoods\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"doc\":\"Phred scaled likelihoods that we have n non-reference alleles at this site.\\n   The number of elements in this array should be equal to the ploidy at this\\n   site, plus 1.\",\"default\":[]},{\"name\":\"strandBiasComponents\",\"type\":{\"type\":\"array\",\"items\":\"int\"},\"doc\":\"Component statistics which comprise the Fisher's Exact Test to detect strand bias.\",\"default\":[]},{\"name\":\"splitFromMultiAllelic\",\"type\":[\"boolean\",\"null\"],\"doc\":\"We split multi-allelic VCF lines into multiple\\n   single-alternate records.  This bit is set if that happened for this\\n   record.\",\"default\":false},{\"name\":\"isPhased\",\"type\":[\"boolean\",\"null\"],\"doc\":\"True if this genotype is phased.\\n\\n   @see phaseSetId\\n   @see phaseQuality\",\"default\":false},{\"name\":\"phaseSetId\",\"type\":[\"null\",\"int\"],\"doc\":\"The ID of this phase set, if this genotype is phased. Should only be populated\\n   if isPhased == true; else should be null.\\n\\n   @see isPhased\",\"default\":null},{\"name\":\"phaseQuality\",\"type\":[\"null\",\"int\"],\"doc\":\"Phred scaled quality score for the phasing of this genotype, if this genotype\\n   is phased. Should only be populated if isPhased == true; else should be null.\\n\\n   @see isPhased\",\"default\":null}]},{\"type\":\"record\",\"name\":\"VariantEffect\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"hgvs\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"referenceAminoAcid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"alternateAminoAcid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"geneId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"transcriptId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]},{\"type\":\"record\",\"name\":\"DatabaseVariantAnnotation\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"variant\",\"type\":[\"null\",\"Variant\"]},{\"name\":\"dbSnpId\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"geneSymbol\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"omimId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"cosmicId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.str","ing\":\"String\"}],\"default\":null},{\"name\":\"clinvarId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"clinicalSignificance\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"gerpNr\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"gerpRs\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"phylop\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"ancestralAllele\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"thousandGenomesAlleleCount\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"thousandGenomesAlleleFrequency\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"siftScore\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"siftScoreConverted\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"siftPred\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"mutationTasterScore\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"mutationTasterScoreConverted\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"mutationTasterPred\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]},{\"type\":\"enum\",\"name\":\"Strand\",\"namespace\":\"org.bdgenomics.formats.avro\",\"symbols\":[\"Forward\",\"Reverse\",\"Independent\"]},{\"type\":\"record\",\"name\":\"Dbxref\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"accession\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"db\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]},{\"type\":\"record\",\"name\":\"Feature\",\"namespace\":\"org.bdgenomics.formats.avro\",\"fields\":[{\"name\":\"featureId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Preferably unique ID for this Feature object\",\"default\":null},{\"name\":\"featureType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The type of feature this is (aka, \\\"track\\\").\\n   \\n   Examples are \\\"conservation\\\", \\\"centipede\\\", \\\"gene\\\"\",\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"The original source for this feature.\\n   \\n   Path/filename/URL and/or the file type (e.g., BED, GFF, etc.)\",\"default\":null},{\"name\":\"contig\",\"type\":[\"null\",\"Contig\"],\"doc\":\"The contig this feature is located on\",\"default\":null},{\"name\":\"start\",\"type\":[\"null\",\"long\"],\"doc\":\"Start coordinate on the contig\",\"default\":null},{\"name\":\"end\",\"type\":[\"null\",\"long\"],\"doc\":\"End coordinate on the contig\",\"default\":null},{\"name\":\"strand\",\"type\":[\"null\",\"Strand\"],\"doc\":\"Strand information for this feature\",\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"doc\":\"The value associated with this feature (if double)\",\"default\":null},{\"name\":\"dbxrefs\",\"type\":{\"type\":\"array\",\"items\":\"Dbxref\"},\"doc\":\"Cross-references into other databases.\",\"default\":[]},{\"name\":\"parentIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"List of parent featureIds, for implementing feature hierachies/graphs.\",\"default\":[]},{\"name\":\"attributes\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"avro.java.string\":\"String\"},\"doc\":\"Additional feature info that doesn't fit into the standard fields above.\\n   \\n   They are all encoded as (string, string) key-value pairs.\",\"default\":{}}]},{\"type\":\"enum\",\"name\":\"Impact\",\"symbols\":[\"HIGH\",\"MODERATE\",\"LOW\",\"MODIFIER\"]},{\"type\":\"record\",\"name\":\"Ratio\",\"fields\":[{\"name\":\"rank\",\"type\":\"int\"},{\"name\":\"total\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"FunctionalAnnotation\",\"fields\":[{\"name\":\"allele\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"annotations\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"impact\",\"type\":\"Impact\"},{\"name\":\"geneName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"geneID\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"featureType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"featureID\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"transcriptBiotype\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"rankTotal\",\"type\":[\"null\",\"Ratio\"]},{\"name\":\"HGSV_c\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"HGSV_p\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"cDNAPositionToLength\",\"type\":[\"null\",\"Ratio\"]},{\"name\":\"CDSPositionToLength\",\"type\":[\"null\",\"Ratio\"]},{\"name\":\"proteinPositionToLength\",\"type\":[\"null\",\"Ratio\"]},{\"name\":\"distanceToFeature\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"errorsWarningsInfo\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]}]},{\"type\":\"record\",\"name\":\"LossOfFunction\",\"fields\":[{\"name\":\"gene\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"numTranscripts\",\"type\":\"int\"},{\"name\":\"percentAffected\",\"type\":\"float\"}]},{\"type\":\"record\",\"name\":\"NonsenseMediateDecay\",\"fields\":[{\"name\":\"gene\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"ID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"numTranscripts\",\"type\":\"int\"},{\"name\":\"percentAffected\",\"type\":\"float\"}]},{\"type\":\"record\",\"name\":\"SnpEffAnnotations\",\"fields\":[{\"name\":\"variant\",\"type\":[\"null\",\"org.bdgenomics.formats.avro.Variant\"]},{\"name\":\"functionalAnnotations\",\"type\":{\"type\":\"array\",\"items\":\"FunctionalAnnotation\"},\"default\":[]},{\"name\":\"lossOfFunction\",\"type\":[\"null\",\"LossOfFunction\"],\"default\":null},{\"name\":\"nonsenseMediateDecay\",\"type\":[\"null\",\"NonsenseMediateDecay\"],\"default\":null}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  public interface Callback extends EFFECTS {
    public static final org.apache.avro.Protocol PROTOCOL = org.tmoerman.adam.fx.avro.EFFECTS.PROTOCOL;
  }
}